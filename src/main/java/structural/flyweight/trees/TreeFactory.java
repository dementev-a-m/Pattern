package structural.flyweight.trees;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by adementev on 20.02.2018.
 */
public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();


    public static TreeType getTreeType(String name, Color color, String otherTreeData){
        TreeType  result = treeTypes.get(name);
        if(result == null){
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name,result);
        }
        return result;

    }
}
