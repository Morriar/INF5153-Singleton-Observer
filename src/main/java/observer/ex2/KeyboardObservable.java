/*
 * Copyright 2016 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package observer.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyboardObservable {

    private List<KeyboardObserver> observers = new ArrayList<>();

    public KeyboardObservable() {}

    public void register(KeyboardObserver observer) {
        observers.add(observer);
    }

    public void unregister(KeyboardObserver observer) {
        observers.remove(observer);
    }

    public void updateObservers(String input) {
        for(KeyboardObserver observer : observers) {
            observer.update(input);
        }
    }

    public void listenKeys() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            updateObservers(input);
        }
    }

}
