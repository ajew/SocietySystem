import cucumber.api.PendingException
import societysystem.Reserva
import societysystem.ReservaController

/**
 * Created by phmb on 5/20/16.
 */

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~'^todos os campos estão ocupados$') { ->
    def c = new ReservaController()
    c.save(new Reserva(campo:'c3'))
    c.response.reset()
    assert Reserva.findByCampo('c3') != null
}
When(~'^Eu tento reservar um campo$') { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Then(~'^O sistema não faz nenhuma reserva$') { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}