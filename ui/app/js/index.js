/**
 * Created by Acer on 06.08.2017.
 */
import React from 'react';
import ReactDOM from 'react-dom';
import { Router, Route, IndexRoute, hashHistory } from 'react-router'
import { Provider } from 'react-redux';
import { createStore, applyMiddleware } from 'redux';
import thunk from 'redux-thunk';
import App from './app.jsx';
import CreateQuestion from './question/create-question.jsx';
import ShowQuestion from './question/show-question.jsx';
import reducer from './reducers';
import css from '../css/app.scss';
import axios from 'axios';
/*

const initialState = {
    answer: []
};

function answer(state = initialState, action = null) {
    if (action.type === 'ADD_ANSWER') {
        return {
            answers: [...state.answers, action.payload]
        };
    } else if (action.type === 'GET_ANSWER') {
        return state;
    }
    return state;
}
*/

const store = createStore(reducer, applyMiddleware(thunk));

ReactDOM.render((
    <Provider store={store}>
        <Router history={hashHistory}>
            <Route path="/" component={App}>
                <IndexRoute component={CreateQuestion}/>
                <Route path="create-question" component={CreateQuestion}/>
                <Route path="show-question/:id" component={ShowQuestion}/>
            </Route>
        </Router>
    </Provider>
), document.getElementById('app'));
