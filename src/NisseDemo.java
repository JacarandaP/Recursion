import java.util.*;

public class NisseDemo {

    public List<Nisse> crateNisseList() { Nisse tomten = new Nisse("Tomten", null, 2);
        Nisse glader = tomten.children[0] = new Nisse("Glader", tomten, 3);
        Nisse butter = tomten.children[1] = new Nisse("Butter", tomten, 4);

        Nisse blygger = glader.children[0] = new Nisse("Blygger", glader, 0);
        Nisse trötter = glader.children[1] = new Nisse("Trötter", glader, 1);
        Nisse tröger = glader.children[2] = new Nisse("Tröger", glader, 0);

        Nisse skumtomten = trötter.children[0] = new Nisse("Skumtomten", trötter, 1);
        Nisse damråttan = skumtomten.children[0] = new Nisse("Damråttan", skumtomten, 0);


        Nisse rådjuret = butter.children[0] = new Nisse("Rådjuret", butter, 0);
        Nisse nyckelpigan = butter.children[1] = new Nisse("Nyckelpigan", butter, 0);
        Nisse haren = butter.children[2] = new Nisse("Haren", butter, 0);
        Nisse räven = butter.children[3] = new Nisse("Räven", butter, 2);

        Nisse gråssuggan = räven.children[0] = new Nisse("Gråssuggan", räven, 0);
        Nisse myran = räven.children[1] = new Nisse("Myran", räven, 1);

        Nisse bladlusen = myran.children[0] = new Nisse("Bladlusen", myran, 0);

        List<Nisse> nisseList = new ArrayList<>();
            nisseList.add(tomten);
            nisseList.add(glader);
            nisseList.add(trötter);
            nisseList.add(tröger);
            nisseList.add(blygger);

            nisseList.add(skumtomten);
            nisseList.add(damråttan);
            nisseList.add(butter);
            nisseList.add(rådjuret);
            nisseList.add(nyckelpigan);
            nisseList.add(haren);
            nisseList.add(räven);
            nisseList.add(gråssuggan);
            nisseList.add(myran);
            nisseList.add(bladlusen);

    return nisseList;
    }

    public List<String> getSublist(Nisse nisse, List<String> allasnamn) {

        int temp = nisse.getChildren().length;

        if (temp !=0 ) {
            for (int i = 0; i <= temp -1 ; i++) {
                allasnamn.add(nisse.children[i].getName());
                getSublist(nisse.children[i], allasnamn);
            }
        }

    return allasnamn;

    }

    public List<String> getChildrenList(List<Nisse> list, String name) {
        String namein = name;
        List<String> tempLf = new ArrayList<>();
        for (Nisse nis : list) {
            if (nis.getName().equalsIgnoreCase(name))
                return getSublist(nis, tempLf);
        } return null;

        }

    public void myMain(){
        List<Nisse> nisseList = crateNisseList();
        System.out.println("Vilken nisses underornade vill du se?");

        try{

            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            List <String> finalList = getChildrenList(nisseList, name);
                if(finalList.size() == 0)
                {
                    System.out.println("Nisse har ingen underornad");
                }
            finalList.forEach(System.out::println);
        }

        catch (Exception e) {System.out.println("Nisse kunde inte hittas");
        }

    }

    public static void main(String[] args) {
        NisseDemo nf = new NisseDemo();
        nf.myMain();

    }
}
