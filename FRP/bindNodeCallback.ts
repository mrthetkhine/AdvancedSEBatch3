import { bindNodeCallback ,merge} from "rxjs";
import * as fs from "fs";
const observableFactory = bindNodeCallback(fs.readFile);

const observable1 = observableFactory("data1.txt");
const observable2 = observableFactory("data2.txt");
const obs3 = merge(observable1,observable2);

const subscription = obs3.subscribe(
    (value) => console.log(value.toString())
);
