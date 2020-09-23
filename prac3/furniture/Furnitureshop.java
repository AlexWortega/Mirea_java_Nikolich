

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private List<Chair> chairs;
    private List<Fork> forks;
    private ArrayList<Chair> chairsBasket;
    private ArrayList<Fork> forksBasket;

    public FurnitureShop() {
        chairs = new ArrayList<Chair>();
        forks = new ArrayList<Fork>();
        chairsBasket = new ArrayList<Chair>();
        forksBasket = new ArrayList<Fork>();
    }

    public void setCatalog() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                chairs.add(new Chair(1000,"black", 40));
            else {
                chairs.add(new Chair(500,"white", 50));
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                forks.add(new Fork(2000,"red", 80));
            else {
                forks.add(new Fork(5000,"yellow", 120));
            }
        }
    }

    public void getChairsCatalog() {
        for (int i = 0; i < chairs.size(); i++) {
            System.out.println("#" + i + "  " + chairs.get(i));
        }
    }
    public void getTablesCatalog() {
        for (int i = 0; i < forks.size(); i++) {
            System.out.println("#" + i + "  " + forks.get(i));
        }
    }

    public void deleteChair(int position) {
        chairs.remove(position);
    }

    public void deleteTable(int position) {
       forks.remove(position);
    }

    public void addChairToBasket(int i) {
        chairsBasket.add(chairs.get(i));
    }

    public void addTableToBasket(int i) {
        forksBasket.add(forks.get(i));
    }

    public void getBasket() {
        int sum = 0;
        if (chairsBasket.size() == 0 && forksBasket.size() == 0) {
            System.out.println("Корзина пуста");
            return;
        }
        System.out.println("Cтулья:");
        for (int i = 0; i < chairsBasket.size(); i++) {
            System.out.println("#" + i + "  " + chairsBasket.get(i));
            sum += chairsBasket.get(i).getPrice();

        }
        int k;
        System.out.println("Столы:");
        for (int i = 0; i < forksBasket.size(); i++) {
            System.out.println("#" + i + "  " + forksBasket.get(i));
            sum += forksBasket.get(i).getPrice();
        }
        System.out.println("\n СТОИМОСТЬ + " + sum);
    }


    public void deleteBasket() {
        chairsBasket.clear();
        forksBasket.clear();
    }


    public void restoreCatalog() {
        chairs.addAll(chairsBasket);
        forks.addAll(forksBasket);
    }
}
