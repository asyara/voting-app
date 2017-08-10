import React from 'react'
import { connect } from 'react-redux';

import { addQuestion } from '../actions/add-question';

class CreateQuestion extends React.Component {

    constructor(props) {
        super(props);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit(event) {
        event.preventDefault();

        let question = {
            name: event.target.elements.theme.value,
            answers: []
        };

        for(var i=0; i < event.target.elements.answer.length; i++) {
            question.answers.push(event.target.elements.answer[i].value)
        };

        this.props.onAddQuestion(question, (response) => {
            this.props.router.push("/show-question/" + response.id);
        });

    }

    render() {
        return (
            <div className="row">
                <div className="col-sm-3"></div>
                <div className="col-sm-6">
                    <form onSubmit={this.handleSubmit}>
                        <input type="text" name="theme" className="form-control" placeholder="Enter your question" />
                        <div className="input-group">
                            <span className="input-group-addon">1</span>
                            <input type="text" name="answer" className="form-control" placeholder="Enter any answer" />
                        </div>

                        <div className="input-group">
                            <span className="input-group-addon">2</span>
                            <input type="text" name="answer" className="form-control" placeholder="Enter any answer" />
                        </div>

                        <div className="input-group">
                            <span className="input-group-addon">3</span>
                            <input type="text" name="answer" className="form-control" placeholder="Enter any answer" />
                        </div>

                        <div className="input-group">
                            <span className="input-group-addon">4</span>
                            <input type="text" name="answer" className="form-control" placeholder="Enter any answer" />
                        </div>

                        <div>
                            <button type="submit" className="btn btn-success btn-lg sbutton">save</button>
                        </div>
                    </form>
                </div>
                <div className="col-sm-3"></div>
            </div>
        )
    }

;
}


export default connect(state => ({}), dispatch => ({
        onAddQuestion: (question, callback) => {
            dispatch(addQuestion(question, callback));
        }
    })
)(CreateQuestion);