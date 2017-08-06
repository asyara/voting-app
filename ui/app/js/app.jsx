import React from 'react'

export default
class App extends React.Component {
    render() {
        return (
            <div class="site-wrapper">

                <div class="site-wrapper-inner">

                    <div class="cover-container container">
                        <div class="row">
                            <div class="inner cover col-xs-12">
                                <h1 class="cover-heading">Welcome to "Voter" - service for creating surveys</h1>

                                <p class="lead">other text</p>

                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3">
                            </div>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" placeholder="Enter your question">
                                    <form>
                                        <div class="input-group">
                                            <span class="input-group-addon">1</span>
                                            <input type="text" class="form-control" placeholder="Enter any answer">
                                            </div>
                                            <div class="input-group">
                                                <span class="input-group-addon">2</span>
                                                <input type="text" class="form-control" placeholder="Enter any answer">
                                                </div>
                                                <div class="input-group">
                                                    <span class="input-group-addon">3</span>
                                                    <input type="text" class="form-control" placeholder="Enter any answer">
                                                    </div>
                                                    <div class="input-group">
                                                        <span class="input-group-addon">4</span>
                                                        <input type="text" class="form-control" placeholder="Enter any answer">
                                                        </div>
                                                        <div style="text-align: right">
                                                            <button type="submit" class="btn btn-success btn-lg sbutton">save</button>
                                                        </div>
                                                    </form>
                                                </div>
                                                <div class="col-sm-3"></div>
                                            </div>
                                        </div>
                                        <div class="mastfoot">
                                            <div class="inner">
                                                <p>Cover template for <a href="https://getbootstrap.com">Bootstrap</a>, by <a
                                                    href="https://twitter.com/mdo">@mdo</a>.</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
        )
    }
}