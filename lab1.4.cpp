#include <iostream>
int main() {
	int nA;
	int* pnA;
	pnA = &nA;
	*pnA = 10;
	void* pV;
	pV = pnA;
	pV = &pnA;
	int sizeint = sizeof(int);
	int sizeDouble = sizeof(double);
	int sizenA = sizeof(nA);
	int sizepnA = sizeof(pnA);
	int sizepV = sizeof(pV);
	return 0;
}
