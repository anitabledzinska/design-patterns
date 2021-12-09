package designpatterns.creational.builder;

    public class Main {

        public static void main(String[] args) {
            House house1 = new House.Builder()
                    .withGarage(true)
                    .withAddress("ul. Abc 123")
                    .withRoomCount(5)
                    .build();
            System.out.println(house1);
            /////////////////////////////////////
            House.Builder builder = new House.Builder();
            builder.withAddress("ul. Xyz 321");
            if (true) {
                builder.withArea(30);
            }
            House house2 = builder.build();
            System.out.println(house2);
        }
    }
