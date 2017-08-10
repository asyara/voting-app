/**
 * Created by Acer on 11.08.2017.
 */
import axios from 'axios';

export const addVote = (vote, callback) => dispatch => {
    axios.post("/api/votes", vote)
        .then((response) => {
            dispatch({type: 'ADD_VOTE_SUCCESS', payload: response.data});

            if (callback) {
                callback();
            }
        }).catch((err) => {
            dispatch({type: 'ADD_VOTE_ERROR', payload: err});
        });
};