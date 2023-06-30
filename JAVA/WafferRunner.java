class Waffer
{
    String name = "Twix";
    int pices;
    String  ingredients;
    int prize= 30;

    Waffer()
    {
        System.out.println("Running the deafault constructer");
    }

}

class wafferRunner 
{
    public static void main(String [] args)
    {
        Sweet ref = new Twix();

        System.out.println("The Waffer name is : "+ref.name);
        System.out.println("The nummber of pices are you can eat is : "+ref.pices);
        System.out.println("The prize of the sweet is : "+ref.prize);
        System.out.println("Ingrediants used to prepaer sweet is : "+ref.ingredients);
        
    }
}