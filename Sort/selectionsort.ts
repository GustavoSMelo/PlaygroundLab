const vetor2: Array<number> = [1, 3, 0, 6, 9, 2];

class SelectionSort {
  pos: number;
  constructor() {
    this.pos = 0;
  }

  Sort() {
    for (let i = 0; i < vetor2.length - 1; i++) {
      this.pos = i;
      for (let j = i + 1; j < vetor2.length; j++) {
        if (vetor2[j] < vetor2[this.pos]) {
          this.pos = j;
        }
      }
      const tmp = vetor2[this.pos];
      vetor2[this.pos] = vetor2[i];
      vetor2[i] = tmp;
    }

    console.log(vetor2);
  }
}

const SS = new SelectionSort();
SS.Sort();
