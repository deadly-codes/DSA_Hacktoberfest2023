matrix = [[1,2,3],[4,5,6],[7,8,9]]
n=len(matrix)
j=0
k=j+1 
for i in range(n-1):
    x=i+1
    while(k!=n): 
        c=matrix[i][x]
        matrix[i][x]=matrix[k][j]
        matrix[k][j]=c 
        k+=1
        x+=1 
    j+=1 
    k=j+1 
for i in range(n):
    matrix[i]=matrix[i][::-1]
