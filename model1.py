#!/usr/bin/env python
# coding: utf-8

# In[1]:



import pandas as pd
import statsmodels.api as sm
from sklearn import linear_model
import tkinter as tk 
import matplotlib.pyplot as plt

#from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg
from statsmodels.stats.outliers_influence import variance_inflation_factor


import pandas as pd
data=pd.read_csv(r"C:\Users\Asus\Documents\stats\fat_data.csv")
data


# In[2]:


datafat=pd.DataFrame(data)


# In[ ]:





# In[3]:


datafat=datafat.drop('ZBody_FAT',axis=1)
datafat=datafat.drop('VAR00001',axis=1)


# In[ ]:





# In[ ]:





# In[4]:


from sklearn import linear_model 
from statsmodels.formula.api import ols


var=ols('Body_FAT~Age+Weight+Height+Neck_Circ+Chest_Circ+Abdomen_circ+Hip_Circ+Thin_Circ+Knee_Circ+Ankle_circ+Extended_Biceps_Circ+Forearm_Circ+Wrist_Circ',data=datafat).fit()


# In[5]:


from statsmodels.stats.outliers_influence import variance_inflation_factor
from patsy import dmatrices 


# In[6]:


y,x=dmatrices('Body_FAT~Age+Weight+Height+Neck_Circ+Chest_Circ+Abdomen_circ+Hip_Circ+Thin_Circ+Knee_Circ+Ankle_circ+Extended_Biceps_Circ+Forearm_Circ+Wrist_Circ',data=datafat,return_type='dataframe')


# In[7]:


vif=pd.DataFrame()
vif['VIF']=[variance_inflation_factor(x.values,i) for i in range(x.shape[1])]
vif['variable']=x.columns
print(var.summary(),'  ',vif)


# In[8]:


from statsmodels.regression.linear_model import OLS

# fit the model
model = OLS(y, x).fit()

# condition number
condition_number = model.condition_number

print('Condition number: ', condition_number)


# In[9]:


datafat.corr()


# In[11]:


import seaborn as sns

sns.heatmap(x.corr().abs(),annot=True)


# In[ ]:




