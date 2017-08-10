import React from 'react'
import { connect } from 'react-redux'

import { getQuestion } from '../actions/get-question'
import { addVote } from '../actions/add-vote'

class ShowQuestion extends React.Component {
    componentDidMount() {
        this.props.onGetQuestion(this.props.params.id);
    }

    constructor(props) {
        super(props);
        this.state = {answerId: ''};

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({answerId: event.target.value});
    }

    handleSubmit(event) {
        event.preventDefault();
        var vote = {
            email: event.target.elements.email.value,
            answer: {
                id: this.state.answerId
            }
        };
        this.props.onAddVote(vote, () => {
            localStorage.setItem("question-" + this.props.question.id, true);
            this.props.onGetQuestion(this.props.params.id);
        });
    }

    render() {
        let isAsked = !!localStorage.getItem("question-" + this.props.question.id);

        return (
            <div className="row">
                <div className="col-sm-3"></div>
                <div className="col-sm-6">
                    <div>
                        <h2>{this.props.question.name}</h2>

                        {isAsked ?
                            (<table className="table">
                                <thead>
                                    <tr>
                                        <th data-field="number">№</th>
                                        <th data-field="description">Description</th>
                                        <td data-field="countAnswer">Count answer</td>
                                    </tr>
                                </thead>
                                <tbody>
                                    {this.props.question.answers.map((answers, index) =>
                                    <tr key={index}>
                                        <td>{index + 1}</td>
                                        <td className="answer">{answers.answerText}</td>
                                        <td>{answers.count}</td>
                                    </tr>
                                    )}
                                </tbody>
                            </table>) :
                            (<div>
                                <table className="table">
                                    <thead>
                                        <tr>
                                            <th data-field="state" data-radio="true"></th>
                                            <th data-field="number">№</th>
                                            <th data-field="description">Description</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                {this.props.question.answers.map((answers, index) =>
                                    <tr key={index}>
                                        <td>
                                            <input type="radio" name="radioGroup" value={answers.id} onChange={this.handleChange}/>
                                        </td>
                                        <td>{index + 1}</td>
                                        <td className="answer">{answers.answerText}</td>
                                    </tr>)}
                                    </tbody>
                                </table>
                                <form onSubmit={this.handleSubmit}>
                                    <div className="input-group">
                                        <input type="text" name="email" className="form-control" placeholder="Enter your email" />
                                    </div>
                                    <div>
                                        <button type="submit" className="btn btn-success btn-lg sbutton">save</button>
                                    </div>
                                </form>
                            </div>)}
                    </div>
                </div>
            </div>
        )
    }

;
}

export default connect(state => ({
        question: state.question
    }), dispatch => ({
        onGetQuestion: (id) => {
            dispatch(getQuestion(id));
        },
        onAddVote: (vote, callback) => {
            dispatch(addVote(vote, callback));
        }
    })
)(ShowQuestion);



