package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.Notepad;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TypeInTheNotePad implements Task {

    private final String text;

    public TypeInTheNotePad(String text) {
        this.text = text;

    }

    public static TypeInTheNotePad withText(String text){
        return instrumented(TypeInTheNotePad.class, text);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Notepad.BTN_TEXTO_ENRIQUECIDO),
                Click.on(Notepad.BTN_NEGRITA),
                Enter.theValue(text).into(Notepad.TEXT_AREA));
    }
}
