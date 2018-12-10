// device: Heating
const Heating = Object.freeze({
	OFF: Symbol("OFF"),
	ON: Symbol("ON")
})

// device: Window
const Window = Object.freeze({
	CLOSED: Symbol("CLOSED"),
	OPEN: Symbol("OPEN")
})

// device state
const state = {
	heating: Heating.OFF,
	window: Window.CLOSED
}

function event(sensor) {
    const oldState = Object.assign({}, state)

    // update device state based on sensor input
    if (sensor == Heating.OFF) state.heating = Heating.OFF
    if (sensor == Heating.ON) state.heating = Heating.ON
    if (sensor == Window.CLOSED) state.window = Window.CLOSED
    if (sensor == Window.OPEN) state.window = Window.OPEN

    // evaluate rules
    if (sensor == Heating.ON) state.window = Window.CLOSED		    
    if (sensor == Window.OPEN) state.heating = Heating.OFF		    

    if (stateChange(oldState, state)) return state
}

function stateChange(s1, s2) {
    return
    s1.heating != s2.heating || 
    s1.window != s2.window
}

console.log(`supported states:
	Heating.OFF
	Heating.ON
	Window.CLOSED
	Window.OPEN
	`);
