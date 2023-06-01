import { of,from, max,pipe } from "rxjs";
let observable = from([1,2,3,22,11,10]);//producer

let obs2 = observable.pipe(max());
obs2.subscribe({
     next(x) {
        console.log('got value ' + x);
      },
      error(err) {
        console.error('something wrong occurred: ' + err);
      },
      complete() {
        console.log('done');
      },
});
console.log('End of line');