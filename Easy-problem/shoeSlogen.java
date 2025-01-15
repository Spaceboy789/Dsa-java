import java.util.Scanner;

public class shoeSlogen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String brand = in.nextLine().toLowerCase();
        String slogan = null;
        switch (brand) {
            case "nike":
                slogan = "Just Do It.";
                break;
            case "adidas":
                slogan = "Impossible is Nothing.";
                break;
            case "reebok":
                slogan = "Be More Human.";
                break;
            case "puma":
                slogan = "Forever Faster.";
                break;
            case "converse":
                slogan = "Express Yourself.";
                break;
            case "vans":
                slogan = "Off The Wall.";
                break;
            case "new balance":
                slogan = "Endorsed By No One.";
                break;
            case "jordan":
                slogan = "To the Next.";
                break;
            case "under armour":
                slogan = "I Will.";
                break;
            case "gucci":
                slogan = "The Ultimate Expression of Individuality.";
                break;
            case "louis vuitton":
                slogan = "Neverfull.";
                break;
            case "chanel":
                slogan = "The Symbol of Elegance.";
                break;
            case "christian louboutin":
                slogan = "Red Soles.";
                break;
            case "jimmy choo":
                slogan = "Walk Like a Star.";
                break;
            case "manolo blahnik":
                slogan = "Hangisi.";
                break;
            default:
                slogan = "Slogan not found for this brand.";
        }

        System.out.println("Slogan: " + slogan);
        in.close();

    }

}
