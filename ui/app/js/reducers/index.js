import { combineReducers } from 'redux';
import answers from './answers';
import question from './question';

export default combineReducers({
    answers,
    question
});