import React from 'react'

export default class M extends React.Component {

    render() {
        return (
            <div className="row">
                <div className="col-sm-3"></div>
                <div className="col-sm-6">
                    <input type="text" className="form-control" placeholder="Enter your question" />
                        <form>
                            <div className="input-group">
                                <span className="input-group-addon">1</span>
                                <input type="text" className="form-control" placeholder="Enter any answer" />
                            </div>

                            <div className="input-group">
                                <span className="input-group-addon">2</span>
                                <input type="text" className="form-control" placeholder="Enter any answer" />
                            </div>

                            <div className="input-group">
                                <span className="input-group-addon">3</span>
                                <input type="text" className="form-control" placeholder="Enter any answer" />
                            </div>

                            <div className="input-group">
                                <span className="input-group-addon">4</span>
                                <input type="text" className="form-control" placeholder="Enter any answer" />
                            </div>

                            <div>
                                <button type="submit" className="btn btn-success btn-lg sbutton">save</button>
                            </div>
                        </form>
                    </div>
                    <div className="col-sm-3"></div>
                </div>
        )
    };
}

