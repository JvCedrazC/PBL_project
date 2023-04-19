package Aplication.Model;

import java.util.ArrayList;
public class Building extends Services{
    private static ArrayList<Component> usedComponents;
    //Class' Methods
    private void addComponent(Component component){
        usedComponents.add(component);
    }
}
