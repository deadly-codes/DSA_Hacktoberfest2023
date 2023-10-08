matrix = [[1,2,3],[4,5,6],[7,8,9]]
int n = matrix.length;
int j = 0;
int k = j+1;

for (int i=0; i<n-1; i++){
    int x = i+1; 
    while (k!=n){
        int c = matrix[i][x];
        matrix[i][x] = matrix[k][j];
        matrix[k][j] = c; 
        x+=1;
        k+=1;
    }
    j+=1;
    k=j+1;
}
for (j=0; j<n; j++){
    int a = matrix[j].length;
    for (int i = 0; i < a / 2; i++) {
        int t = matrix[j][i];
        matrix[j][i] = matrix[j][a - i - 1];
        matrix[j][a - i - 1] = t;
    }
}
