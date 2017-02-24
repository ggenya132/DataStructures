/**
 * Created by eugenevendensky on 2/24/17.
 */
public class Link<T> {

    public T dataOne;
    public int id;
    Link<T> nextLink;

    public Link(T one){

        this.dataOne = one;
    }
    public void printLink(){
        System.out.println(dataOne + " ");
    }
}
