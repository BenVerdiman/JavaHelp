public class ReloadConfig {
    public void ConfigReload(){
        //Connect the main class to this class
        Main main = Main.main;
        //This method will reload only the default config
        main.reloadConfig();
    }
}
