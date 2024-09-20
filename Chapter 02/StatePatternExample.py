class StateExample:
    def do_specificAction(self, context):
        pass
class StateIdle(StateExample):
    def do_specificAction(self, context):
        print("Microplayer is in the Idle state.")
        context.set_state(self)
class StatePlaying(StateExample):
    def do_specificAction(self, context):
        print("Microplayer is in the Playing state.")
        context.set_state(self)
class StatePaused(StateExample):
    def do_specificAction(self, context):
        print("Microplayer is in the Paused state.")
        context.set_state(self)
class Context:
    def __init__(self):
        self._state = None
    def set_state(self, state):
        self._state = state
    def perform_specificAction(self):
        self._state.do_specificAction(self)

if __name__ == "__main__":
    microplayer = Context()

    idle_state = StateIdle()
    playing_state = StatePlaying()
    paused_state = StatePaused()

    microplayer.set_state(idle_state)

    microplayer.perform_action()
    
    microplayer.set_state(playing_state)
    microplayer.perform_specificAction()

    microplayer.set_state(paused_state)
    microplayer.perform_specificAction()
