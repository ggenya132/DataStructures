/**
 * Created by eugenevendensky on 2/24/17.
 */
public class LinkedList<T> {
    private Link<T> first;
    static int id;

    public LinkedList(){

        first = null;

    }

    public boolean isEmpty(){

        return first == null;
    }

    public void insert(T dataOne){

        Link<T> link = new Link<T>(dataOne);
        link.id = this.id;
        link.nextLink = first;
        first = link;
        id++;
    }

    public Link<T> delete(){
        Link temp = first;
        first = first.nextLink;
        return temp;

    }


    public void printList(){
        Link<T> currentLink = first;
        System.out.println("List : ");
        while(currentLink!=null){
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
    }

    public Link<T> find(int index){
        Link<T> currentLink = first;
        while (currentLink!= null){
            if(currentLink.id == index){

                return currentLink;
            }
        }
        return null;
    }

}
