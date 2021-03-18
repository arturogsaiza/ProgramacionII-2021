package plano;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: gustavomaedo
 * Date: 4/11/20
 * Time: 4:58 PM
 */
public class Smile {
    boolean isSet = false;
    int height;
    int width;
    String icon = " X ";
    String noIcon = "   ";
    List<Map<String, Integer>> coordinates = new ArrayList<>();
    List<String> image = new ArrayList<>();

    public void setSize(int height, int width) {
        if(!isSet) {
            this.height = height;
            this.width = width;
            isSet = true;
        }
    }

    public void setIcon(String icon) {
        if(isSet) {
            this.icon = " "+icon+" ";
        }
    }

    public void setEmptyIcon(String icon) {
        if(isSet) {
            this.noIcon = " "+icon+" ";
        }
    }

    public void addCoordinate(int x, int y) {
        if(x < height && y < width && isSet) {
            Map<String, Integer> coordinate = new HashMap<>();
            coordinate.put("x", x);
            coordinate.put("y", y);
            coordinates.add(coordinate);
        }
    }

    public void createImage() {
        if(isSet) {
            for(int i=0;i<height;i++) {
                image.add(getRow(i));
            }
        }
    }

    public void printImage() {
        if(isSet) {
            for(String row : image) {
                System.out.println(row);
            }
        }
    }

    private String getRow(int index) {
        List<Integer> icons = new ArrayList<>();
        StringBuilder row = new StringBuilder();
        for(Map<String, Integer> value : coordinates) {
            int x = value.get("x");
            int y = value.get("y");
            if(y == index) {
                icons.add(x);
            }
        }
        for(int i=0;i<width;i++) {
            boolean contains = icons.contains(i);
            String content = noIcon;
            if(contains) {
                content = icon;
            }
            row.append(content);
        }
        return row.toString();
    }
}
