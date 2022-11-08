package no.ntnu;

/**
 * MAin entrypoint for the application
 */
public class Main {
    /**
     * Start the application
     * @param args Not used
     */
    public static void main(String[] args) {
        System.out.println("Starting the application...");
        App app = new App();
        app.run();
        System.out.println("Application finished");
    }
}