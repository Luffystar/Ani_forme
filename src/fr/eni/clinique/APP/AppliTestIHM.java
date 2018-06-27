package fr.eni.clinique.APP;

import fr.eni.clinique.IHM.controller.HomeController;

public class AppliTestIHM {

    public static void main(String[] args) throws Exception {

        try {
            HomeController homeController = HomeController.getInstance();
            homeController.initView();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
