package ThinkInJava.Type_Information.Null_Objects.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 *
 * 有了Position, 你就不需要创建空对象了，
 * 因为Person.Null的存在就表示这是一个空Position[ffl 后，
 * 你可能会发现需要增加一个显式的用千Position的空对象，
 * 是YAGNI0 (You Art;:n't Going to
 * Need It, 你永不需要它）声明：在你的设计草案的初稿中，
 * 应该努力使用最简单且可以工作的事物，直至程序的某个方面要求你添加额外的特性，
 * 而不是一开始就假设它是必需的］。
 *
 *
 *
 * @Date: Create in 11:00 2019/5/19
 */
public class Position {

    private String title;
    private Person person;
    public Position(String jobTitle, Person employee) {
        title = jobTitle;
        person = employee;
        if(person == null)
            person = Person.NULL;
    }
    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.NULL;
    }
    public String getTitle() { return title; }
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public Person getPerson() { return person; }
    public void setPerson(Person newPerson) {
        person = newPerson;
        if(person == null)
            person = Person.NULL;
    }
    public String toString() {
        return "Position: " + title + " " + person;
    }


}
