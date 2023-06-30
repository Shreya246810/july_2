class Biscuit
{
    String name = "Happy Happy";
    int pices;
    String  ingredients;
    int prize= 10;

    Biscit()
    {
        System.out.println("Running the deafault constructer");
    }

}

class BiscuitRunner 
{
    public static void main(String [] args)
    {
        Sweet ref = new Biscuit();

        System.out.println("The Biscit name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}