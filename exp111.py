#!/usr/bin/env python
# coding: utf-8

# In[1]:


import pandas as pd

sales=pd.read_csv(r"C:\Users\Asus\Documents\advanced analytics\10day\reg\G.csv")
sales.columns


# In[2]:


import statsmodels.api as sm
from statsmodels.formula.api import ols
model=ols('Sales~Advt',data=sales).fit()
model1=sm.stats.anova_lm(model)
model1
print(model.summary())


# In[3]:


x=sales.iloc[:,1:3]
x
y=sales.iloc[:,0:1]



# In[4]:


from sklearn.model_selection import train_test_split


x_t,x_te,y_t,y_te=train_test_split(x,y,test_size=0.2,random_state=42)


# In[5]:


y_t


# In[17]:


from sklearn.linear_model import LinearRegression
from sklearn import linear_model


lg=LinearRegression()
model=lg.fit(x_t,y_t)
y_pred=model.predict(x_te)
# a=model.score(y_pred,y_te)


# In[18]:


y_pred


# In[24]:


print(model.score(x_t,y_t))


# In[ ]:

print(model.score(y_pred,y_te))



# In[ ]:




