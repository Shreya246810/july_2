class Chocolate
{
    String name = "Dairymilk";
    int pices;
    String  ingredients;
    int prize= 50;

    Chocolate()
    {
        System.out.println("Running the deafault constructer");
    }

}

class ChocolateRunner 
{
    public static void main(String [] args)
    {
        Sweet ref = new Chocolate();

        System.out.println("The Chocolate name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}