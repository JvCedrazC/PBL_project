package Aplication.Model;

import java.util.List;
public class Building extends Services{
    private static List<Component> usedComponents;
    //Class' Methods
    private void addComponent(Component component){
        usedComponents.add(component);
    }
}
