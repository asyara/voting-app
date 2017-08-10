/**
 * Created by Acer on 11.08.2017.
 */
const initialState = {
    answers: []
};

export default function question(state = initialState, action = null) {
    if (action.type === 'GET_QUESTION_SUCCESS') {
        return action.payload
    } else if (action.type === 'GET_QUESTION_ERROR') {
        return state;
    }
    return state;
}