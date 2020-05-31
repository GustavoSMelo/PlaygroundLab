const vetor3: Array<number> = [1, 3, 0, 6, 9, 2];

class InsertionSort {
  constructor() {}

  Sort() {
    for (let i: number = 0; i < vetor3.length - 1; i++) {
      for (let j: number = i + 1; j < vetor3.length; j++) {
        if (vetor3[j] < vetor3[i]) {
          const tmp = vetor3[i];
          vetor3[i] = vetor3[j];
          vetor3[j] = tmp;
          break;
        }
      }
    }

    console.log(vetor3);
  }
}

const IS = new InsertionSort();
IS.Sort();
