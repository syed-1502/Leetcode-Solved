bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target) {
    int col=-1;
    for(int i=0;i<matrixSize;i++)
    {
        if(matrix[i][0]<=target)
        {
            col=i;
        }
    }
    if(col==-1)return false;
    for(int i=0;i<matrixColSize[col];i++)
    {
        printf("%d ",matrix[col][i]);
        if(matrix[col][i]==target) 
        {
            printf("%d ",matrix[col][i]);
            return true;
        }
    }
    return false;
}