import axios from 'axios';

export const addQuestion = (question, callback) => dispatch => {
    axios.post("/api/themes", question)
        .then((response) => {
            dispatch({type: 'ADD_QUESTION_SUCCESS', payload: response.data});

            if (callback) {
                callback(response.data);
            }
        }).catch((err) => {
            dispatch({type: 'ADD_QUESTION_ERROR', payload: err});
        });
};