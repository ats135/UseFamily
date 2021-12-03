public class Family {

    String name;
    int age;
    Person [] people;
    int totalNumOfPeople;
    boolean space = true;


    public Family(){
        this.people = new Person[10];
        totalNumOfPeople = 0;
    }

    public void display() {
        for (int index = 0; index < totalNumOfPeople; index++) {
            System.out.println(this.people[index].getName());
            System.out.println(this.people[index].getAge());
        }
    }

    public void birthday(String name){
        for (int index = 0; index < totalNumOfPeople; index++){
            if(this.people[index].getName().equals(name)){
                this.people[index].incrementAge();
            }
        }
    }

    public boolean addPerson(String name, int age) {
        if(totalNumOfPeople+1 <= 10) {
            totalNumOfPeople++;
            this.people[totalNumOfPeople-1] = new Person(name,age);
            return(true);
        }else{
            return(false);
        }

    }


    public int getNumberOfPeople(){
        return(totalNumOfPeople);
    }

    public int getTotalAge(){
       int totalAge = 0;

        for(int i= 0; i < totalNumOfPeople;i++){
            totalAge += this.people[i].getAge();
        }
        return(totalAge);
    }

}
