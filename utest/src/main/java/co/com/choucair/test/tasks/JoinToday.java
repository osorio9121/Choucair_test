package co.com.choucair.test.tasks;

import co.com.choucair.test.userinterface.ChoucairJoinToday;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class JoinToday implements Task {
    private String strName;
    private String strLast;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;

    public JoinToday(String strName, String strLast, String strEmail, String strMonth, String strDay, String strYear) {
        this.strName = strName;
        this.strLast = strLast;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }



    public static JoinToday onThePage(String strName, String strLast, String strEmail, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(JoinToday.class,strName,strLast,strEmail,strMonth,strDay,strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairJoinToday.JOIN_BUTTON),
                Enter.theValue(strName).into(ChoucairJoinToday.INPUT_NAME),
                Enter.theValue((strLast)).into(ChoucairJoinToday.INPUT_LAST),
                Enter.theValue((strEmail)).into(ChoucairJoinToday.INPUT_EMAIL),
                Enter.theValue((strMonth)).into(ChoucairJoinToday.BIRTH_MONTH),
                Enter.theValue((strDay)).into(ChoucairJoinToday.BIRTH_DAY),
                Enter.theValue((strYear)).into(ChoucairJoinToday.BIRTH_YEAR),
                Click.on(ChoucairJoinToday.LOCATION_BUTTON)
        );
    }
}
