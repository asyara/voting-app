const initialState = {
    answer: []
};

export default function answer(state = initialState, action = null) {
    if (action.type === 'ADD_ANSWER') {
        return [
            ...
            state,
            action.payload
        ]
    } else if (action.type === 'GET_ANSWER') {
        return state;
    }
    return state;
}