class Bun
{
    String name = "Hot Crossbun";
    int pices;
    String  ingredients;
    int prize= 50;

    Bun()
    {
        System.out.println("Running the deafault constructer");
    }

}

class BunRunner 
{
    public static void main(String [] args)
    {
        Sweet ref = new Bun();

        System.out.println("The Bun name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}