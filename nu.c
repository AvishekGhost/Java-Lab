#include<stdio.h>
#include<math.h>
#define MAX 3
int main(){
	float aL[MAX][MAX], aR[MAX];
	int i = 0,j=0;
	printf("Enter The elements For the LEFT SIDE:\n");
	for(i=0;i<MAX;i++){
		for(j=0;j<MAX;j++){
			scanf("%f",&aL[i][j]);
		}
	}
	printf("Enter the elements for RIGHT SIDE\n");
	for(i=0;i<MAX;i++){
		scanf("%f",&aR[i]);
	}
	printf("Printing --\n");
	for(i=0;i<MAX;i++){
		for(j=0;j<MAX;j++){
			printf("%d ",aL[i][j]);
		}
		if(i == 1){
			printf("=");
		}
		printf("%d",aR[i]);
		printf("\n");
	}
	
	for (int j = 0; i < MAX; ++i){
			X1 = (aR[0] - aL[0][1]*x2 - aL[0][2] * x3 )/aL[0][0];
			X2 = (aR[1] - aL[1][0]*x2 - aL[1][2] * x3 )/aL[1][1];
			X1 = (aR[2] - aL[2][0]*x2 - aL[2][1] * x3 )/aL[2][0];
	}

    return 0;
}

1 2 3   8 a1
4 5 6 = 9 a2
7 8 9   4 a3

x1 = 8 - 2 - 3 / 1;
