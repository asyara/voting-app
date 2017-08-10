
export const getAnswer = () => dispatch => {
    axios.get("/api/answers")
        .then((response) => {
            dispatch({type: 'FETCH_ANSWERS_SUCCESS', payload: response.data.content});
        }).catch((err) => {
            dispatch({type: 'FETCH_ANSWERS_ERROR', payload: err});
        });
}