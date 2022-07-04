package co.com.testQA21feb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.mockito.stubbing.Answer;

import static co.com.testQA21feb.userinterface.TextBoxUser.BTN_ELEMENTS;

public class Validation_Pestania_2 implements Question <Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        if(BTN_ELEMENTS.resolveFor(actor).isVisible())
            return true;
            return false;
           }

           public Validation_Pestania_2 validPest2(){
        return new Validation_Pestania_2();
           }
}
