package miscellaneous.Abstract;

public class AirIndia extends ParentAirCraft {
    @Override
    public void color() {
        System.out.println("Red Color On Body");
    }

    public static void main(String[] args) {
        AirIndia ai = new AirIndia();
        ai.color();
        ai.engine();;
        ai.safety();
    }
    //cannot instantiate Abstract Class  (object cannot be make)
}
