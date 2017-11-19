package com.OOPstore.Suvenirs;

public class CreatFactory {

    public static Suvenir create(int id){
        Suvenir suvenir;
        String[] types = {"bottle", "n_cup","t_cup","notebook"};
        String[] colors = {"red","whit","black"};

        String type = types[(int)(Math.random()* (types.length ))];
        String color = colors[(int)(Math.random()* (colors.length ))];
        switch (type){
            case "bottle":
                int price = (int)(10 + Math.random()* 15);
            suvenir = new Bottle(id, "bottle_for_wather", price, type, 0.5f,  color);
                break;
            case "n_cup":
                price = (int) (10 + Math.random() * 20);
                suvenir = new NormalCup(id, "pretty_normal_cup", price, type, 0.3f,  color);
                break;
            case "t_cup":
                price = (int) (10 + Math.random() * 25);
                suvenir = new TermoCup(id, "good_termo_cup", price, type, 0.5f,  color);
                break;
            default:
                boolean[] calendar = {false, true};
                boolean is_calendar = calendar[(int)(Math.random()* 2)];
                price = (int) (5 + Math.random() * 10);
                suvenir = new NoteBook(id, "Planer))", price, type, is_calendar);
                break;
        }
        return suvenir;
    }
}
