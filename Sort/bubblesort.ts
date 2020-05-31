const vetor: Array<number> = [1, 3, 0, 6, 9, 2];

class BubbleSort {
  constructor() {}

  Sort() {
    for (let i = 0; i < vetor.length - 1; i++) {
      for (let j = 0; j < vetor.length - 1 - i; j++) {
        if (vetor[j] > vetor[j + 1]) {
          const tmp = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = tmp;
        }
      }
    }
    console.log(vetor);
  }
}

const bs = new BubbleSort();
bs.Sort();
