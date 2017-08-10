/**
 * Created by Acer on 10.08.2017.
 */
import axios from 'axios';

export const getQuestion = (id) => dispatch => {
    axios.get("/api/themes/" + id)
        .then((response) => {
            dispatch({type: 'GET_QUESTION_SUCCESS', payload: response.data});
        }).catch((err) => {
            dispatch({type: 'GET_QUESTION_ERROR', payload: err});
        });
};