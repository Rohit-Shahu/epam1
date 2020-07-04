package org.example;


/**
 * Hello world!
 *
 */
public class App {


        // public instance initialized when loading the class
        private static final App instance = new App();

        private App() {
                //private constructor
        }

        public static App getInstance() {
                return instance;
        }

}