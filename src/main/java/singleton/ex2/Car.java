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
package singleton.ex2;

public class Car {

    private Integer gas = 10;
    private Boolean started = false;

    public void start() {
        if(started) {
            Logger.getInstance().warning("Car already started");
        } else {
            started = true;
            Logger.getInstance().info("Car started");
        }
    }

    public void drive() {
        if(!started) {
            Logger.getInstance().error("Car not started");
            return;
        } else if(gas <= 0) {
            Logger.getInstance().error("Gas is empty");
            return;
        } else if(gas <= 3) {
            Logger.getInstance().error("Gas is nearly depleted");
        }
        Logger.getInstance().info("Car driving");
        gas--;
    }

}
