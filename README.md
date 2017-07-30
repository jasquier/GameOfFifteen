#Game of Fifteen

An implementation of the handheld game of fifteen...

1. Send board state to front end.
2. Receive board state from front end with id to previous board state.
3. Check if new board state represents a valid transition from previous board state.
4. If valid write board state to db and get new id, go to step 1.
5. If invalid revert to step 1.